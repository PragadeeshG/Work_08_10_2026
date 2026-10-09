package com.test1;

public class LangGraphIncorpEdgeRouting {
	private long edgeRoutingId;
	private long workflowDefinitionId;
	private String sourceNodeId;
	private String targetNodeId;
	private String edgeType;
	private String routingCondition;
	private String conditionalExpression;
	private String routingFunctionName;
	private long routingPriority;
	private String fallbackRouteEnabled;
	private String fallbackNodeId;
	private String parallelRoutingEnabled;
	private String dynamicRoutingEnabled;
	private String routeEvaluationResult;
	private long routeExecutionCount;
	private String lastRoutedTime;
	private String routingStatus;
	private String status;

	public LangGraphIncorpEdgeRouting() {

	}

	public LangGraphIncorpEdgeRouting(long edgeRoutingId, long workflowDefinitionId, String sourceNodeId,
			String targetNodeId, String edgeType, String routingCondition, String conditionalExpression,
			String routingFunctionName, long routingPriority, String fallbackRouteEnabled, String fallbackNodeId,
			String parallelRoutingEnabled, String dynamicRoutingEnabled, String routeEvaluationResult,
			long routeExecutionCount, String lastRoutedTime, String routingStatus, String status) {
		super();
		this.edgeRoutingId = edgeRoutingId;
		this.workflowDefinitionId = workflowDefinitionId;
		this.sourceNodeId = sourceNodeId;
		this.targetNodeId = targetNodeId;
		this.edgeType = edgeType;
		this.routingCondition = routingCondition;
		this.conditionalExpression = conditionalExpression;
		this.routingFunctionName = routingFunctionName;
		this.routingPriority = routingPriority;
		this.fallbackRouteEnabled = fallbackRouteEnabled;
		this.fallbackNodeId = fallbackNodeId;
		this.parallelRoutingEnabled = parallelRoutingEnabled;
		this.dynamicRoutingEnabled = dynamicRoutingEnabled;
		this.routeEvaluationResult = routeEvaluationResult;
		this.routeExecutionCount = routeExecutionCount;
		this.lastRoutedTime = lastRoutedTime;
		this.routingStatus = routingStatus;
		this.status = status;
	}

	public long getEdgeRoutingId() {
		return edgeRoutingId;
	}

	public void setEdgeRoutingId(long edgeRoutingId) {
		this.edgeRoutingId = edgeRoutingId;
	}

	public long getWorkflowDefinitionId() {
		return workflowDefinitionId;
	}

	public void setWorkflowDefinitionId(long workflowDefinitionId) {
		this.workflowDefinitionId = workflowDefinitionId;
	}

	public String getSourceNodeId() {
		return sourceNodeId;
	}

	public void setSourceNodeId(String sourceNodeId) {
		this.sourceNodeId = sourceNodeId;
	}

	public String getTargetNodeId() {
		return targetNodeId;
	}

	public void setTargetNodeId(String targetNodeId) {
		this.targetNodeId = targetNodeId;
	}

	public String getEdgeType() {
		return edgeType;
	}

	public void setEdgeType(String edgeType) {
		this.edgeType = edgeType;
	}

	public String getRoutingCondition() {
		return routingCondition;
	}

	public void setRoutingCondition(String routingCondition) {
		this.routingCondition = routingCondition;
	}

	public String getConditionalExpression() {
		return conditionalExpression;
	}

	public void setConditionalExpression(String conditionalExpression) {
		this.conditionalExpression = conditionalExpression;
	}

	public String getRoutingFunctionName() {
		return routingFunctionName;
	}

	public void setRoutingFunctionName(String routingFunctionName) {
		this.routingFunctionName = routingFunctionName;
	}

	public long getRoutingPriority() {
		return routingPriority;
	}

	public void setRoutingPriority(long routingPriority) {
		this.routingPriority = routingPriority;
	}

	public String getFallbackRouteEnabled() {
		return fallbackRouteEnabled;
	}

	public void setFallbackRouteEnabled(String fallbackRouteEnabled) {
		this.fallbackRouteEnabled = fallbackRouteEnabled;
	}

	public String getFallbackNodeId() {
		return fallbackNodeId;
	}

	public void setFallbackNodeId(String fallbackNodeId) {
		this.fallbackNodeId = fallbackNodeId;
	}

	public String getParallelRoutingEnabled() {
		return parallelRoutingEnabled;
	}

	public void setParallelRoutingEnabled(String parallelRoutingEnabled) {
		this.parallelRoutingEnabled = parallelRoutingEnabled;
	}

	public String getDynamicRoutingEnabled() {
		return dynamicRoutingEnabled;
	}

	public void setDynamicRoutingEnabled(String dynamicRoutingEnabled) {
		this.dynamicRoutingEnabled = dynamicRoutingEnabled;
	}

	public String getRouteEvaluationResult() {
		return routeEvaluationResult;
	}

	public void setRouteEvaluationResult(String routeEvaluationResult) {
		this.routeEvaluationResult = routeEvaluationResult;
	}

	public long getRouteExecutionCount() {
		return routeExecutionCount;
	}

	public void setRouteExecutionCount(long routeExecutionCount) {
		this.routeExecutionCount = routeExecutionCount;
	}

	public String getLastRoutedTime() {
		return lastRoutedTime;
	}

	public void setLastRoutedTime(String lastRoutedTime) {
		this.lastRoutedTime = lastRoutedTime;
	}

	public String getRoutingStatus() {
		return routingStatus;
	}

	public void setRoutingStatus(String routingStatus) {
		this.routingStatus = routingStatus;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
