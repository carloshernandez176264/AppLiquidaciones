package com.AppLiquidaciones.AppLiquidaciones.domain.model.updateSalary;

import com.AppLiquidaciones.AppLiquidaciones.domain.model.employee.attributes.Salary;

public class UpdateSalary {

    private Salary salary;

    public UpdateSalary(Salary salary) {
        validateUpdateSalary(salary);
        this.salary = salary;
    }

    private void validateUpdateSalary(Salary salary) {
        if (salary == null) {
            throw new IllegalArgumentException("El salario no puede ser nulo");
        } else if (salary.getValue() <= 1160000) {
            throw new IllegalArgumentException("El salario no debe ser inferior al salario minimo");
        } else if (salary.getValue() > 7000000) {
            throw new IllegalArgumentException("El salario no debe ser superior a 7 millones");
        } else if (salary.getValue() < salary.getValue()) {
            throw new IllegalArgumentException("El salario no puede ser Menos que el salario actual");
        }
    }

    public Salary getSalary() {
        return salary;
    }
}
