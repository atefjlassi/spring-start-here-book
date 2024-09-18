package spring.start.here.repository;

import java.util.List;
import org.springframework.expression.spel.ast.NullLiteral;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import spring.start.here.model.Purchase;

@Repository
public class PurchaseRepository {

  private final JdbcTemplate jdbc;

  public PurchaseRepository(JdbcTemplate jdbc) {
    this.jdbc = jdbc;
  }

  public void storePurchase(Purchase purchase) {
    String sql = "INSERT INTO purchase VALUES (NULL, ?, ?)";
    jdbc.update(sql, purchase.getProduct(), purchase.getPrice());
  }

  public List<Purchase> findAllPurchases() {
    String sql = "SELECT * FROM purchase";

    RowMapper<Purchase> purchaseRowMapper = getPurchaseRowMapper();

    /**
     * We send the SELECT query using the
     * query method, and we provide the
     * row mapper object for JdbcTemplate
     * to know how to transform the data
     * it gets in Purchase objects.
     */
    return jdbc.query(sql, purchaseRowMapper);
  }

  /**
   * We implement a RowMapper object
   * that tells JdbcTemplate how to map a
   * row in the result set into a Purchase
   * object. In the lambda expression,
   * parameter “r” is the ResultSet (the
   * data you get from the database),
   * while parameter “i” is an int
   * representing the row number.
   */
  private static RowMapper<Purchase> getPurchaseRowMapper() {
    RowMapper<Purchase> purchaseRowMapper = (r, i) -> {
      Purchase rowObject = new Purchase();
      rowObject.setId(r.getInt("id"));
      rowObject.setProduct(r.getString("product"));
      rowObject.setPrice(r.getBigDecimal("price"));
      return rowObject;
    };
    return purchaseRowMapper;
  }

}
