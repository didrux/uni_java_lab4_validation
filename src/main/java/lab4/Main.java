package lab4;

public class Main {
    public static void main(String[] args) {
        Employee.EmployeeBuilder employeeBuilder = new Employee.EmployeeBuilder("gsakgddsg Smithers")
                .setSalary(100.0)
                .setAddress("")
                .setPhoneNumber("3809500000009999999")
                .setIsInsuranced(true);

        Employee employee1 = employeeBuilder.build();
        System.out.println(employee1);

        Producer.ProducerBuilder producerBuilder = new Producer.ProducerBuilder("fdbeang")
                .setAddress("Universitetska,20")
                .setContactPerson(employee1);

        Producer producer1 = producerBuilder.build();
        System.out.println(producer1);

        Product.ProductBuilder productBuilder = new Product.ProductBuilder(10, "j")
                .setCategory("gsdfg")
                .setQuantity(12410)
                .setPrice(10);

        Product p = productBuilder.build();

    }
}