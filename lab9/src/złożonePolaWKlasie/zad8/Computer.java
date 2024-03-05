package złożonePolaWKlasie.zad8;

import java.util.Objects;

public class Computer {
    private String brand;
    private String model;
    private Processor processor;

    public Computer(String brand, String model, Processor processor) {
        this.brand = brand;
        this.model = model;
        this.processor = (processor == null) ? new Processor() : new Processor(processor);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Processor getProcessor() {
        return new Processor(processor);
    }

    public void setProcessor(Processor processor) {
        this.processor = (processor == null) ? new Processor() : new Processor(processor);
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ": brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", processor=" + processor +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Computer computer = (Computer) o;

        if (!Objects.equals(brand, computer.brand)) return false;
        if (!Objects.equals(model, computer.model)) return false;
        return Objects.equals(processor, computer.processor);
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (processor != null ? processor.hashCode() : 0);
        return result;
    }
}
