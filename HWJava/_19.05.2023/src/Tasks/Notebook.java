package Tasks;

import java.util.List;
import java.util.Map;

public class Notebook {
        private String name;
        private int ram;
        private int memory;
        private String os;
        private String color;
        private List<String> filteredNotebooks;

    public Notebook(String name, int ram, int memory, String os, String color) {
        this.name = name;
        this.ram = ram;
        this.memory = memory;
        this.os = os;
        this.color = color;
    }
    Notebook(int ram, int memory, String os){
        this(null, ram, memory, os, null);
    }
    Notebook(int ram, int memory){
        this(ram, memory, null);
    }

    public String getName() {
        return name;
    }
    public int getRam() {return ram;}
    public int getMemory() {
        return memory;
    }
    public String getOs() {
        return os;
    }
    public String getColor() {
        return color;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public List<String> getFilteredNotebooks() {
        return filteredNotebooks;
    }
    @Override
    public String toString() {
        return "Название: " + name + ", ОЗУ: " + ram + ", Объем жесткого диска: " + memory + ", Операционная система: " + os + ", Цвет: " + color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (!(obj instanceof Notebook)){
            return false;
        }
        Notebook example = (Notebook) obj;
        if (((ram == 1) || ram <= example.ram) && ((memory == 1)|| memory <= example.memory) &&
                ((os == null) || os.equals(example.os)) && ((color == null) || color.equals(example.color))){
            return true;
        }else {
            return false;
        }
    }// сравнивание экземпляра с ноутбуком
    @Override
    public int hashCode() {
        return name.hashCode() + 7*ram + 11*os.hashCode() + 71*memory + 17*color.hashCode();
    }

    public void addInFiltered(String name){
        filteredNotebooks.add(name);
    }


}
