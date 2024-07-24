package Repository;

import model.Account;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, String> {

}
