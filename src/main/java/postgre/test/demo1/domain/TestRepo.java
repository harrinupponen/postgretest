package postgre.test.demo1.domain;

import org.springframework.data.repository.CrudRepository;

public interface TestRepo extends CrudRepository<PgTest, Long>  {

}
