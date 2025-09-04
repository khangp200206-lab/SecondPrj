package iuh.fit.se;

public class RecTangle {
//--Attribute
	private double length;
    private double width;

    // Constructor mặc định
    public RecTangle() {
        this.length = 1.0;
        this.width = 1.0;
    }

    // Constructor có tham số
    public RecTangle(double length, double width) {
        if (length <= 0 || width <= 0) {
            throw new IllegalArgumentException("Length and width must be greater than 0");
        }
        this.length = length;
        this.width = width;
    }

    // Getter
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    // Setter
    public void setLength(double newVal) {
        if (newVal <= 0) {
            throw new IllegalArgumentException("Length must be greater than 0");
        }
        this.length = newVal;
    }

    public void setWidth(double newVal) {
        if (newVal <= 0) {
            throw new IllegalArgumentException("Width must be greater than 0");
        }
        this.width = newVal;
    }

    // Tính toán
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "RecTangle[Length=" + length +
                ", Width=" + width +
                ", Perimeter=" + getPerimeter() +
                ", Area=" + getArea() + "]";
    }
}

/**
 * @description:  This class represents a bank with many bank accounts
 * @author:  Huynh Huy Khang
 * @version: 1.0
 * @created: Sep 4, 2025 5:33:46 PM
 */
