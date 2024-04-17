package homework7;

public class Hw7task3_Conspect {
    /*Створити клас Конспект. Клас повинен містити такі поля:
ПІБ студента;
Назва предмету;
Кількість сторінок;
Рік випуску;
Колір обкладинки.
Назва закладу, де навчається студент;*/

    private String fullName;
    private String subjectName;
    private int pageCount;
    private int year;
    private String coverColor;
    private String institutionName;

public Hw7task3_Conspect(String fullName, String subjectName,
                         int pageCount, int year, String coverColor, String institutionName) {
    this.fullName = fullName;
    this.subjectName = subjectName;
    this.pageCount = pageCount;
    this.year = year;
    this.coverColor = coverColor;
    this.institutionName = institutionName;
}
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getCoverColor() {
        return coverColor;
    }

    public void setCoverColor(String coverColor) {
        this.coverColor = coverColor;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public void setInstitutionName(String institutionName) {
        this.institutionName = institutionName;
    }

    public static void main(String[] args) {
        Hw7task3_Conspect student = new Hw7task3_Conspect("Василь Васильович Василенко", "Історія",
                55, 1997, "жовтий", "University");
        System.out.println("ПІБ: " + student.fullName);
        System.out.println("Предмет: " + student.subjectName);
        System.out.println("Кількість сторінок: " + student.pageCount);
        System.out.println("Рік випуску: " + student.year);
        System.out.println("Колір обкладинки: " + student.coverColor);
        System.out.println("Назва закладу: "+ student.institutionName);
    }
}
