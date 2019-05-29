package es.salesianos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import es.salesianos.model.Airplane;
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

	public void setRepositoryWorker(RepositoryWorker repositoryWorker) {
		this.repositoryWorker = repositoryWorker;
	}

	public void addWorker(Worker worker) {
		repositoryWorker.insertWorker(worker);
	}
}
