package br.com.ExemploJDBC.controller;

import java.sql.SQLException;
import java.util.ArrayList;

import br.com.ExemploJDBC.model.Department;

public class Teste {

	public static void main(String[] args) {
		
		AbstractCRUD<Department> crud;
		// ...
		crud = new CRUDDepartment<Department>();
		try {
			System.out.println(crud.open());
			/*
			 * INSERT
			Department d = new Department();
			d.setNameDepartment("DPT. Comp");
			d.setBuildingDepartment("Campus Sede");
			d.setBudgetDepartment(18000.0);
			
			boolean res = crud.create(d);
			*/
			// DELETE
			//boolean res = crud.delete(1);
			
			/*
			UPDATE
			Department d = new Department();
			d.setIdDepartment(2);
			d.setNameDepartment("Departamento Comp");
			d.setBuildingDepartment("Campus Sede");
			d.setBudgetDepartment(180000.0);
			
			boolean res = crud.update(d);
			
			if(res) {
				System.out.println("Operação realizada com sucesso");
			} else {
				System.out.println("Erro");
			}
			*/
			/*
			 * Select by id
			Department dep = crud.getById(2);
			System.out.println(dep.getNameDepartment());
			*/
			
			ArrayList<Department> departments = crud.listAll();
			for(Department d : departments) {
				System.out.println(d.getNameDepartment());
			}
			System.out.println(crud.close());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
