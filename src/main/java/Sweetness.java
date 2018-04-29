class Sweetness {

    protected String name;
    protected float weight;
    protected float price;

    public Sweetness(String name, float weight, float price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}

class Candy extends Sweetness{

    private float hardness;

    public Candy(String name, float weight, float price, float hardness) {
        super(name, weight, price);
        this.hardness = hardness;
    }

    public float getHardness() {
        return hardness;
    }

    public void setHardness(float hardness) {
        this.hardness = hardness;
    }
}

class Jellybean extends Sweetness{

    private int color;

    public Jellybean(String name, float weight, float price, int color) {
        super(name, weight, price);
        this.color = color;
    }
}

class Cake extends Sweetness{

    private String cream;

    public Cake(String name, float weight, float price, String cream) {
        super(name, weight, price);
        this.cream = cream;
    }
}

class Prize{
    public Sweetness[] getSweetnesses() {
        return sweetnesses;
    }

    private  Sweetness[] sweetnesses;
    private int index;

    public Prize(int count){
        sweetnesses = new Sweetness[count];
        this.index =0;
    }

    public void addPrize(Sweetness sweet){
        sweetnesses[index] = sweet;
        index++;
    }
}