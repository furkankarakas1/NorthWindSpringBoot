package kodlamaio2.northwind2.business.abstracts;

import kodlamaio2.northwind2.core.entities.User;
import kodlamaio2.northwind2.core.utilities.results.DataResult;
import kodlamaio2.northwind2.core.utilities.results.Result;

public interface UserService {
	Result add(User user);
	DataResult<User> findByEmail(String email);
}
