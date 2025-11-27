package application;

import model.Dao.DaoFactory;
import model.Dao.SellerDao;
import model.entietes.Department;
import model.entietes.Seller;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        SellerDao sellerDao = DaoFactory.createSellerDao();
        System.out.println("=== TEST 1: seller find by Id ===");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list){
            System.out.println(obj);
        }

        System.out.println("=== TEST 2: seller find all ===");
        list = sellerDao.findAll();
        for (Seller obj : list){
            System.out.println(obj);
        }
    }
}
