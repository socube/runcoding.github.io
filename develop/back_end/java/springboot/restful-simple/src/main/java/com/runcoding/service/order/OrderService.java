package com.runcoding.service.order;

import com.runcoding.model.po.order.OrderPo;


/**
 * @author xukai
 * @Date 2018-01-02 17:23:57
 */
public interface OrderService {
    
    /**
     * @author xukai
     * @Date 2018-01-02 17:23:57
     */
    OrderPo select(Long id);

    
    /**
     * @author xukai
     * @Date 2018-01-02 17:23:57
     */
    int insert(OrderPo po);

    
    /**
     * @author xukai
     * @Date 2018-01-02 17:23:57
     */
    int update(OrderPo po);

    
    /**
     * @author xukai
     * @Date 2018-01-02 17:23:57
     */
    int delete(OrderPo po);
}