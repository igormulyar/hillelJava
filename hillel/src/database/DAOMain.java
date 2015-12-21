package database;

import java.nio.charset.Charset;

/**
 * Created by IMulyar on 14.12.2015.
 */
public class DAOMain {

    public static void main(String[] args) {
        //ProductDAO productDAO = new ProductDbDAO();
        String daoType = args[0];
        ProductDAO productDAO;

        productDAO = ProductDAOFactory.createDAO(daoType);


        System.out.println(productDAO.findAll());

        productDAO.create(new Product(5, "Keyboard", "Computers", 25));


        System.out.println(productDAO.findById(4));

        //productDAO.deleteById(4);



    }


}
