package kodlamaio2.northwind2.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio2.northwind2.business.abstracts.UserService;
import kodlamaio2.northwind2.core.dataAccess.UserDao;
import kodlamaio2.northwind2.core.entities.User;
import kodlamaio2.northwind2.core.utilities.results.DataResult;
import kodlamaio2.northwind2.core.utilities.results.Result;
import kodlamaio2.northwind2.core.utilities.results.SuccessDataResult;
import kodlamaio2.northwind2.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService{
	private UserDao userDao;

    @Autowired
    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public Result add(User user) {
        this.userDao.save(user);
        return new SuccessResult("Kullanıcı Eklendi");
    }

    @Override
    public DataResult<User> findByEmail(String email) {
        return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı Bulundu");
    }

}
