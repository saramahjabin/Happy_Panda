package com.dao;


import com.model.UserRole;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UserRoleDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Transactional
    public UserRole getRoleUser() {
        Session session=sessionFactory.getCurrentSession();
        Criteria crit=session.createCriteria(UserRole.class).add(Restrictions.eq("roleName", "ROLE_USER"));
        //crit.add(Restrictions.eq("user_name", userName));
        return (UserRole)crit.uniqueResult();
        /*return (UserRole) sessionFactory
                .getCurrentSession()
                .createCriteria(UserRole.class)
                .add(Restrictions.eq("roleName", "ROLE_USER"))
                .uniqueResult();*/
    }




}
