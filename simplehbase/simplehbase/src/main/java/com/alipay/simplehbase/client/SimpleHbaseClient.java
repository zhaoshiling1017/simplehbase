package com.alipay.simplehbase.client;

import com.alipay.simplehbase.client.service.AggregateService;
import com.alipay.simplehbase.client.service.BasicService;
import com.alipay.simplehbase.client.service.HBaseDataSourceAware;
import com.alipay.simplehbase.client.service.HBaseTableConfigAware;
import com.alipay.simplehbase.client.service.HbaseMultipleVersionService;
import com.alipay.simplehbase.client.service.SimpleHbaseVersionedService;

/**
 * SimpleHbaseClient.
 * 
 * <pre>
 * The main entry point to use SimpleHbase framework.
 * </pre>
 * 
 * @author xinzhi
 * */
public interface SimpleHbaseClient extends BasicService,
        SimpleHbaseVersionedService, HbaseMultipleVersionService,
        AggregateService, HBaseDataSourceAware, HBaseTableConfigAware {

}
