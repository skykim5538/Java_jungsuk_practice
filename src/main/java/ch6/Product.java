package ch6;

class Ex6_29 {
}

public class Product {
    static int count = 0;
    int serialNo;

    {
        ++count;
        serialNo = count;
    }
    public Product(){}
}
class ProductEx_2{
    public static void main(String[] args) {
    }
}
