package Module2.Level28.Tasks.ProductAndMarket;

import java.util.List;

/***** Агрегация 2 *****
 * Нужно реализовать связь типа агрегация (нестрогая связь) между классами Market и Product,
 * с учетом того, что продукт может существовать независимо от магазина,
 * а магазин может содержать список продуктов заполненный или пустой.
 * Также должна быть возможность этот список получить и изменить.
 * -----
 * Требования:
 * • Класс Market должен быть реализован согласно условию.
 * • Класс Product не изменяй.
 */

public class Solution {
    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("Носки", 34),
                new Product("Зубная паста", 85),
                new Product("Сок", 19));

        Market market = new Market("Ашан");
        market.setProducts(products);

        System.out.println(market.getProducts().get(0).getName());
    }
}





















