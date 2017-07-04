/**
 * 苹果类
 * Created by wangxing
 * Date: 2017/7/4.
 * Time: 23:03
 */
public class Apple {

    public Apple(Integer weight, String color) {
        this.weight = weight;
        this.color = color;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                ", id=" + id +
                '}';
    }

    private Long id;
    private String color;
    private Integer weight;
}
