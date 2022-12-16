package parallel;
import java.lang.*;
import java.lang.Object;

public class threadlocal {
	
	interface MyBaseRepository<T, ID extends Serializable> extends Repository<T, ID> {
		  T findOne(ID id);
		  T save(T entity);
		}

		interface UserRepository extends MyBaseRepository<User, Long> {

		  User findByEmailAddress(EmailAddress emailAddress);
		}
	
	public class Context {
	    private String userName;
	 
	    public Context(String userName) {
	        this.userName = userName;
	    }
	}

	public class ThreadLocalWithUserContext implements Runnable {
		  
	    private static ThreadLocal<Context> userContext 
	      = new ThreadLocal<>();
	    private Integer userId;
	    private UserRepository userRepository = new UserRepository();
	 
	    @Override
	    public void run() {
	        String userName = userRepository.getUserNameForUserId(userId);
	        userContext.set(new Context(userName));
	        System.out.println("thread context for given userId: "
	          + userId + " is: " + userContext.get());
	    }
	     
	    // standard constructor
	}
}
