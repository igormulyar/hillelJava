package database;

/**
 * Created by IMulyar on 21.12.2015.
 */
public class ProductDAOFactory {
    public static ProductDAO createDAO(String daoType) {
        ProductDAO productDAO;
        switch (daoType){
            case "db" : productDAO = new ProductDbDAO();
                break;
            case "memory" : productDAO = new ProductMemoryDAO();
                break;
            case "xml" : productDAO = new ProductXmlDAO();
                break;
            default:
                productDAO = new ProductMemoryDAO();
                System.out.println("expected: db / memory / xml ,  but found "+daoType);
        }
        return productDAO;
    }
}
