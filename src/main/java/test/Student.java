package test;

import javax.persistence.*;

@Entity   //by default student k objects     //zarroori h lgana
@Table(name="Stu_info")     //agr dusri table bnani ho to   //not neccessar
public class Student {
    @Id      //neccessay           //ye annotations hibernate ki nhi h JPA create krta h.hibernate implement krta h
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int marks;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getMarks() {
            return marks;
        }
        @Override
        public String toString(){
            return "student{" +
                    "id=" + id +
                    ", marks=' " + name + '\'' +
                    '}';
        }
        public void setMarks(int marks){ this.marks= marks;}

    }


