package main.interfaces;

import java.util.List;

import main.entity.Employee;
import main.entity.Result;



public interface ResultServiceLocal {

	Boolean addResult(Result result);

	Boolean updateResult(Result result);

	Boolean deleteResult(Result result);

	Boolean deleteResult(int id);

	Boolean deleteResult(String id);

	Result findResultById(Integer id);

	Result findResultById(String id);

	List<Result> findAllResult();

	List<Employee> listeResultsbyname();

	Long CountResults();

}
