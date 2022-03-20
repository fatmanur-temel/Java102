public class Main {

    public static void main(String[] args) {
        //Don't repeat yourself!

        Course course1 = new Course(1,"Java", "Engin Demirog", "1,5 ay sürecek kamp.");
        Course course2 = new Course(2,"CSharp", "Engin Demirog", "2 ay sürecek kamp.");
        Course[] courses = {course1,course2};

        Category category1 = new Category();
        category1.id = 1;
        category1.name = "Kurslarım";
        Category category2 = new Category();
        category2.id = 2;
        category2.name = "Kampa Hazırlık";
        Category[] categories = {category1,category2};

        for(Course course: courses){
            System.out.println(course.name);
        }
        for (Category category: categories){
            System.out.println(category.name);
        }

        CategoryManager categoryManager = new CategoryManager();
        categoryManager.add(category1);
        categoryManager.remove(category2);

    }
}
