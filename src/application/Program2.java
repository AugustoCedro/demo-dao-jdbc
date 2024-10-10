package application;


import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

import java.util.List;

public class Program2 {
    public static void main(String[] args) {
        DepartmentDao departmentDao = DaoFactory.createDepartmentDao();

        System.out.println("=== test 1: department insert");
        Department dep = new Department(null, "Medicine");
        departmentDao.insert(dep);
        System.out.println("Inserted! New id = " + dep.getId());

        System.out.println("=== test 2: department update");
        dep.setId(2);
        departmentDao.update(dep);
        System.out.println("Update completed");

        System.out.println("=== test 3: department delete");
        int id = 12;
        departmentDao.deleteById(id);
        System.out.println("Delete completed");

        System.out.println("=== test 4: department findById");

        Department department = departmentDao.findById(10);
        System.out.println(department);

        System.out.println("=== test 5: department findByAll");
        List<Department> list = departmentDao.findAll();
        for(Department obj : list){
            System.out.println(obj);
        }
    }
}
