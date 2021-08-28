package demo;

import model.*;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
    public static void main(String[] args) {
        BookStore bookStore = new BookStore();
        bookStore.process();
    }

    private void process() {
        Customer customer = new Customer();

        BookStore bookStore = new BookStore();
        bookStore.buy(customer);

    }

    private void buy(Customer customer) {
        Book book1 = new Book();
        Book book2 = new Book();

        Bucket bucket = new Bucket(customer);
        List<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        bucket.addBooks(books);

        // calculation max discount
        Discount discount = new Discount();
        int maxDiscountPrice = discount.calculation(bucket);

        // checkout
        Checkout checkout = new Checkout();
        checkout.process(bucket, new PaymentType(), new Shipping());

        Item item = new Item();
    }
}
