public class CategoryManager {

    void add(Category category){
        System.out.println("Yeni kategori eklendi!");
        System.out.println("Kategori: "+category.name);
    }

    void remove(Category category){
        System.out.println(category.name+" silindi!");
    }
}
