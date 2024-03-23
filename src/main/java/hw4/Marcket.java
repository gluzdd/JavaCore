package hw4;

import hw4.exception.ProductNotFoundException;
import hw4.exception.QuantityIsNegativeException;
import hw4.exception.UserNotFoundException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Marcket {
    private List<User> users;
    private List<Product> products;
    private List<Order> orders;
//    private List<Order> holiDay;
    private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd");

    public Marcket(){
        users = new ArrayList<>(List.of(
                new User("Artem", Gender.Man,35,"13423244"),
                new User("Anna", Gender.Woman,25,"23456452"),
                new User("Kris",Gender.Woman, 39,"46546256"),
                new User("Masha",Gender.Woman, 22,"56446255")
        ));
        products = new ArrayList<>(List.of(
                new Product("Milk", 55),
                new Product("Bread", 44),
                new Product("Cheese", 88)
        ));



        orders = new ArrayList<>();
    }

       public int createOrder(User user) throws UserNotFoundException {
        if(!users.contains(user)) throw new UserNotFoundException("покупатель не найден " + user);
        Order order = new Order(user);
        orders.add(order);
        return order.getId();
    }
    public  Order addProductToOrder(int orderId, Product product, int quantity) throws ProductNotFoundException, QuantityIsNegativeException {
        if(!products.contains(product)) throw new ProductNotFoundException("продукт не найден");
        if(quantity<=0) throw new QuantityIsNegativeException("не верное колличество товаров");
        Order order = null;
//        Order order = orders.stream().filter(o->o.getId() == orderId).findFirst().get();
        for (Order o: orders) {
            for (User u : users) {
                if (Objects.equals(o.getDateBuy(), Holiday.MARCH_8.getCode()) && u.getGender() == Gender.Woman) {
                    product.setPrice((product.getPrice() * 0.85));
                }
                else if (Objects.equals(o.getDateBuy(), Holiday.FEBRUARY_23.getCode()) && u.getGender() == Gender.Man) {
                    product.setPrice((product.getPrice() * 0.85));
                }
                else if (Objects.equals(o.getDateBuy(), Holiday.NEW_YEAR.getCode())) {
                    product.setPrice((product.getPrice() * 0.85));
                }
                else {
                    product.getPrice();
                }
            }
        }
        for (Order o: orders) {
            if(o.getId() == orderId){
                order =o;
                break;
            }
        }
        order.add(product,quantity);
        return order;
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Product> getProducts() {
        return products;
    }

    public List<Order> getOrders() {
        return orders;
    }
}
