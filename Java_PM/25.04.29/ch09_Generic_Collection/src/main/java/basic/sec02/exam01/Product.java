package basic.sec02.exam01;

public class Product <K, M > {
    private  K kind;
    private  M model;

    @Override
    public String toString() {
        return "Product{" +
                "kind=" + kind +
                ", model=" + model +
                '}';
    }

    public K getKind() {
        return kind;
    }

    public void setKind(K kind) {
        this.kind = kind;
    }

    public M getModel() {
        return model;
    }

    public void setModel(M model) {
        this.model = model;
    }
}
