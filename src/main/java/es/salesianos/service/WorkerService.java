package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.salesianos.model.Airplane;
import es.salesianos.model.Role;
import es.salesianos.model.Worker;
import es.salesianos.repository.RepositoryAirplane;
import es.salesianos.repository.RepositoryWorker;

@Service("workerService")
public class WorkerService {
	@Autowired
	@Qualifier("repositoryWorker")
	private RepositoryWorker repositoryWorker;

	public RepositoryWorker getRepositoryWorker() {
		return repositoryWorker;
	}
	
	public List<Worker> selectAllWorkers() {
		return repositoryWorker.selectWorkers();
	}
	
	public List<Worker> selectAllWorkersById(int id) {
		return repositoryWorker.selectWorkersByID(id);
	}
	
	public List<Worker> selectAllWorkersByName(String name) {
		return repositoryWorker.selectWorkersByName(name);
	}
	
	public List<Worker> selectAllWorkersByPassport(String passport) {
		return repositoryWorker.selectWorkersByPassport(passport);
	}
	
	public List<Worker> selectAllWorkersBySurname(String surname) {
		return repositoryWorker.selectWorkersBySurname(surname);
	}
	
	public Worker selectAtLogIn(int idWorker) {
		return repositoryWorker.selectWorkerByID(idWorker);
	}
	
	public List<Worker> listAllPilots(int idRole) {
		return repositoryWorker.selectWorkersByIdRole(idRole);
	}
	
	public List<Worker> listAllCoPilots(int idRole) {
		return repositoryWorker.selectWorkersByIdRole(idRole);
	}
	
	public List<Worker> listAllChiefCrewMembers(int idRole) {
		return repositoryWorker.selectWorkersByIdRole(idRole);
	}
	
	public List<Worker> listAllFlightAttendants(int idRole) {
		return repositoryWorker.selectWorkersByIdRole(idRole);
	}

	public void setRepositoryWorker(RepositoryWorker repositoryWorker) {
		this.repositoryWorker = repositoryWorker;
	}

	public void addWorker(Worker worker) {
		repositoryWorker.insertWorker(worker);
	}
}
