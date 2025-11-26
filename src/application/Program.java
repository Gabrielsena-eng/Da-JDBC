package application;

import model.Dao.DaoFactory;
import model.Dao.SellerDao;
import model.entietes.Department;
import model.entietes.Seller;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
    }
}
