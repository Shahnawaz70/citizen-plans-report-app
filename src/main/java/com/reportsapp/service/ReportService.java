package com.reportsapp.service;

import java.util.List;

import com.reportsapp.entity.CitizenPlan;
import com.reportsapp.request.SearchRequest;

import jakarta.servlet.http.HttpServletResponse;

public interface ReportService {
	public List<String> getPlanNames();
	
	public List<String> getPlanStatus();
	
	public List<CitizenPlan> search(SearchRequest request);
	
	public boolean exportExcel(HttpServletResponse response) throws Exception;
	
	public boolean exportPdf(HttpServletResponse response) throws Exception;

}
