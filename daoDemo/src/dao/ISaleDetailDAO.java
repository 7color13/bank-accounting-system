package dao;

import vo.SaleDetail;


import java.util.List;

public interface ISaleDetailDAO {   //销售详情接口
    public boolean doInsert(SaleDetail saleDetail) throws Exception;
    public boolean doUpdate(SaleDetail saleDetail) throws Exception;
    public List<SaleDetail> getByDay(String todayStr) throws Exception;
}
