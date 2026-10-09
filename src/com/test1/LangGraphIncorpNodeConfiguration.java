package com.test1;

public class LangGraphIncorpNodeConfiguration {
	private long nodeConfigurationId;
	private long workflowDefinitionId;
	private long langGraphConfigurationId;
	private String nodeId;
	private String nodeName;
	private String nodeType;
	private String nodeDescription;
	private String agentReferenceId;
	private String nodeFunctionName;
	private String inputStateKeys;
	private String outputStateKeys;
	private String nodeExecutionMode;
	private long nodeTimeout;
	private String retryEnabled;
	private long maximumRetryAttempts;
	private String fallbackNodeId;
	private String nodePriority;
	private String nodeStatus;

	public LangGraphIncorpNodeConfiguration() {

	}

	public LangGraphIncorpNodeConfiguration(long nodeConfigurationId, long workflowDefinitionId,
			long langGraphConfigurationId, String nodeId, String nodeName, String nodeType, String nodeDescription,
			String agentReferenceId, String nodeFunctionName, String inputStateKeys, String outputStateKeys,
			String nodeExecutionMode, long nodeTimeout, String retryEnabled, long maximumRetryAttempts,
			String fallbackNodeId, String nodePriority, String nodeStatus) {
		super();
		this.nodeConfigurationId = nodeConfigurationId;
		this.workflowDefinitionId = workflowDefinitionId;
		this.langGraphConfigurationId = langGraphConfigurationId;
		this.nodeId = nodeId;
		this.nodeName = nodeName;
		this.nodeType = nodeType;
		this.nodeDescription = nodeDescription;
		this.agentReferenceId = agentReferenceId;
		this.nodeFunctionName = nodeFunctionName;
		this.inputStateKeys = inputStateKeys;
		this.outputStateKeys = outputStateKeys;
		this.nodeExecutionMode = nodeExecutionMode;
		this.nodeTimeout = nodeTimeout;
		this.retryEnabled = retryEnabled;
		this.maximumRetryAttempts = maximumRetryAttempts;
		this.fallbackNodeId = fallbackNodeId;
		this.nodePriority = nodePriority;
		this.nodeStatus = nodeStatus;
	}

	public long getNodeConfigurationId() {
		return nodeConfigurationId;
	}

	public void setNodeConfigurationId(long nodeConfigurationId) {
		this.nodeConfigurationId = nodeConfigurationId;
	}

	public long getWorkflowDefinitionId() {
		return workflowDefinitionId;
	}

	public void setWorkflowDefinitionId(long workflowDefinitionId) {
		this.workflowDefinitionId = workflowDefinitionId;
	}

	public long getLangGraphConfigurationId() {
		return langGraphConfigurationId;
	}

	public void setLangGraphConfigurationId(long langGraphConfigurationId) {
		this.langGraphConfigurationId = langGraphConfigurationId;
	}

	public String getNodeId() {
		return nodeId;
	}

	public void setNodeId(String nodeId) {
		this.nodeId = nodeId;
	}

	public String getNodeName() {
		return nodeName;
	}

	public void setNodeName(String nodeName) {
		this.nodeName = nodeName;
	}

	public String getNodeType() {
		return nodeType;
	}

	public void setNodeType(String nodeType) {
		this.nodeType = nodeType;
	}

	public String getNodeDescription() {
		return nodeDescription;
	}

	public void setNodeDescription(String nodeDescription) {
		this.nodeDescription = nodeDescription;
	}

	public String getAgentReferenceId() {
		return agentReferenceId;
	}

	public void setAgentReferenceId(String agentReferenceId) {
		this.agentReferenceId = agentReferenceId;
	}

	public String getNodeFunctionName() {
		return nodeFunctionName;
	}

	public void setNodeFunctionName(String nodeFunctionName) {
		this.nodeFunctionName = nodeFunctionName;
	}

	public String getInputStateKeys() {
		return inputStateKeys;
	}

	public void setInputStateKeys(String inputStateKeys) {
		this.inputStateKeys = inputStateKeys;
	}

	public String getOutputStateKeys() {
		return outputStateKeys;
	}

	public void setOutputStateKeys(String outputStateKeys) {
		this.outputStateKeys = outputStateKeys;
	}

	public String getNodeExecutionMode() {
		return nodeExecutionMode;
	}

	public void setNodeExecutionMode(String nodeExecutionMode) {
		this.nodeExecutionMode = nodeExecutionMode;
	}

	public long getNodeTimeout() {
		return nodeTimeout;
	}

	public void setNodeTimeout(long nodeTimeout) {
		this.nodeTimeout = nodeTimeout;
	}

	public String getRetryEnabled() {
		return retryEnabled;
	}

	public void setRetryEnabled(String retryEnabled) {
		this.retryEnabled = retryEnabled;
	}

	public long getMaximumRetryAttempts() {
		return maximumRetryAttempts;
	}

	public void setMaximumRetryAttempts(long maximumRetryAttempts) {
		this.maximumRetryAttempts = maximumRetryAttempts;
	}

	public String getFallbackNodeId() {
		return fallbackNodeId;
	}

	public void setFallbackNodeId(String fallbackNodeId) {
		this.fallbackNodeId = fallbackNodeId;
	}

	public String getNodePriority() {
		return nodePriority;
	}

	public void setNodePriority(String nodePriority) {
		this.nodePriority = nodePriority;
	}

	public String getNodeStatus() {
		return nodeStatus;
	}

	public void setNodeStatus(String nodeStatus) {
		this.nodeStatus = nodeStatus;
	}

}
