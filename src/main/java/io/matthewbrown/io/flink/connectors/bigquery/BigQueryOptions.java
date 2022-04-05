package io.matthewbrown.io.flink.connectors.bigquery;

import java.io.Serializable;

public class BigQueryOptions implements Serializable {
    private String projectId;
    private String tableName;

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getTableName() {
        return tableName;
    }

    public String getFullyQualifiedTableName() {
        String[] parts = tableName.split("\\.");
        return "projects/" + getProjectId() + "/datasets/" + parts[0] + "/tables/" + parts[1];
    }

    public String getProjectId() {
        return projectId;
    }
}

