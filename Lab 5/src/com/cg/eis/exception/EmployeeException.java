package com.cg.eis.exception;

public class EmployeeException extends Exception {
	EmployeeException(String str) {
		super(str);
	}

	static void verify(int salary) throws EmployeeException {
		if (salary < 3000) {
			throw new EmployeeException("Salary is below 3000");
		} else {
			System.out.println("Salary is above 3000");
		}
	}

	public static void main(String args[]) {
		try {
			verify(60);
		} catch (EmployeeException e) {
			System.out.println(e);
		}

		System.out.println("Salary Verification");
	}
}
