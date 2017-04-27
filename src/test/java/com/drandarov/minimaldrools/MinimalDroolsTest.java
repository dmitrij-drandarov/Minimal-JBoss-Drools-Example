package com.drandarov.minimaldrools;

import org.junit.jupiter.api.Test;
import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

/**
 * @author dmitrij-drandarov
 * @since 27 Apr 17
 */
class MinimalDroolsTest {

    @Test
    void testNewCustomerRule() {
        KieServices ks = KieServices.Factory.get();
        KieContainer kContainer = ks.getKieClasspathContainer();
        KieSession kSession = kContainer.newKieSession();

        Customer k = new Customer();
        k.setPrivateCustomer(true);

        kSession.insert(k);
        kSession.fireAllRules();
    }

}
