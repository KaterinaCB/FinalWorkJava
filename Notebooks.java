class NoteBooks {
    private static int count = 0;
    private int id;
    private String model;
    private int ram;
    private int storage;
    private String os;
    private String color;
    private double diagonal;

    public NoteBooks(String model, int ram, int storage, String os, String color, double diagonal) {
        this.id = ++count;
        this.model = model;
        this.ram = ram;
        this.storage = storage;
        this.os = os;
        this.color = color;
        this.diagonal = diagonal;
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public double getDiagonal() {
        return diagonal;
    }

    @Override
    public String toString() {
        return "Ноутбук " + "Номер " + id +
                ", Модель " + model + '\'' +
                ", Объем оперативной памяти " + ram +
                ", Объем накопителя " + storage +
                ", Операционная система " + os + '\'' +
                ", Цвет " + color + '\'' +
                ", Диагональ экрана " + diagonal;
    }
}

