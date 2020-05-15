package org.vishnu.prototype;

/**
 * @author vishnu.g
 * @project org.vishnu.prototype : prototype-pattern
 * @created 14/May/2020
 */
public class ConcretePrototypeA implements Prototype {

    //private String name;
    private Integer typeId;
    //private int id;

    public ConcretePrototypeA() {
    }

    public ConcretePrototypeA(Integer typeId) {
        this.typeId = typeId;
    }
//    public ConcretePrototypeA(String name, Integer typeId, int id) {
//        this.name = name;
//        this.typeId = typeId;
//        this.id = id;
//    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Override
    public Prototype clone() {
        /* Depending on requirement we have to implement shallow/deep copy */
        ConcretePrototypeA obj = null;
        try {
            obj = (ConcretePrototypeA) super.clone();
        } catch (CloneNotSupportedException exc) {
            exc.printStackTrace();
        }
        return obj;
    }

    @Override
    public String toString() {
        return "ConcretePrototype{" +
                //"name='" + name + '\'' +
                ", typeId=" + typeId +
                //", id=" + id +
                '}';
    }
}
