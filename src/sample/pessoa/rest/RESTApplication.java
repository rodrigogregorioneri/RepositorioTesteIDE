package sample.pessoa.rest;

import javax.ws.rs.ApplicationPath;
import org.glassfish.jersey.server.ResourceConfig;


/**
 * Realiza disponibiliza os pacotes rest.
 * @generated
 */

@ApplicationPath("/api/rest/sample/pessoa")
public class RESTApplication extends ResourceConfig {

    /**
     * @generated
     */
	public RESTApplication() {
		packages("sample.pessoa.rest");
	}

}