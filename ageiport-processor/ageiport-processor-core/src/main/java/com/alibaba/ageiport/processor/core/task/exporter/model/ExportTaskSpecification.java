package com.alibaba.ageiport.processor.core.task.exporter.model;

import com.alibaba.ageiport.processor.core.TaskSpec;
import com.alibaba.ageiport.processor.core.task.exporter.ExportProcessor;

/**
 * @author lingyi
 */
public interface ExportTaskSpecification<QUERY, DATA, VIEW> extends TaskSpec {

    ExportProcessor<QUERY, DATA, VIEW> getExportProcessor();

    Class<QUERY> getQueryClass();

    Class<DATA> getDataClass();

    Class<VIEW> getViewClass();

    Integer getPageSize();

    String getFileType();
}
