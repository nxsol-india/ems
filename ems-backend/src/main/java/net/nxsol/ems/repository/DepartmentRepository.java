package net.nxsol.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.nxsol.ems.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
