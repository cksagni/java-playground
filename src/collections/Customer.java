package collections;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Comparable<Customer>, Serializable {
    private String name;
    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if(this == o) return true;
        if (!(o instanceof Customer cust)) return false;
        return this.name.equals(cust.name) && this.email.equals(cust.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.email);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return name.compareTo(o.name);
    }
}
