package com.reportsapp.service;


import java.io.File;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.reportsapp.entity.CitizenPlan;
import com.reportsapp.repository.CitizenPlanRepository;
import com.reportsapp.request.SearchRequest;
import com.reportsapp.utils.EmailUtil;
import com.reportsapp.utils.ExcelGenerator;
import com.reportsapp.utils.PdfGenerator;

import jakarta.servlet.http.HttpServletResponse;

@Service
public class ReportServiceImpl implements ReportService {
	
	@Autowired
	private CitizenPlanRepository planRepository;
	
	@Autowired
	private ExcelGenerator excelGenerator;
	
	@Autowired
	private PdfGenerator pdfGenerator;
	
	@Autowired
	private EmailUtil emailUtil;
	
	@Override
	public List<String> getPlanNames() {
		return planRepository.getPlanNames();
	}

	@Override
	public List<String> getPlanStatus() {
		return planRepository.getPlanStatus();
	}

	@Override
	public List<CitizenPlan> search(SearchRequest request) {

	    CitizenPlan entity = new CitizenPlan();

	    if (request.getPlanName() != null
	            && !request.getPlanName().isEmpty()) {
	        entity.setPlanName(request.getPlanName());
	    }

	    if (request.getPlanStatus() != null
	            && !request.getPlanStatus().isEmpty()) {
	        entity.setPlanStatus(request.getPlanStatus());
	    }

	    if (request.getGender() != null
	            && !request.getGender().isEmpty()) {
	        entity.setGender(request.getGender());
	    }
	    
	    if (request.getStartDate() != null) {
	        entity.setPlanStartDate(request.getStartDate());
	    }

	    if (request.getEndDate() != null) {
	        entity.setPlanEndDate(request.getEndDate());
	    }
	    Example<CitizenPlan> example = Example.of(entity);

	    return planRepository.findAll(example);
	}

	@Override
	public boolean exportExcel(HttpServletResponse response) throws Exception {
		File f = new File("plans.xls");
		List<CitizenPlan> plans = planRepository.findAll();
		excelGenerator.generator(response, plans,f);
		
		String subject = "Test Email";
		String body = "<h1>Test mail body</h1>";
		String to = "shahnawaz707096@gmail.com";
		
		File f1 = new File("plans.xls");
		emailUtil.sendEmail(subject, body, to,f1);
		f1.delete();
		return true;
	}

	@Override
	public boolean exportPdf(HttpServletResponse response) throws Exception {
		
		File f1 = new File("plans.pdf");
		List<CitizenPlan> plans = planRepository.findAll();
		pdfGenerator.generator(response, plans,f1);
		String subject = "Test Email";
		String body = "<h1>Test mail body</h1>";
		String to = "shahnawaz707096@gmail.com";
		emailUtil.sendEmail(subject, body, to,f1);
		f1.delete();
		
		return true;
	}

}
