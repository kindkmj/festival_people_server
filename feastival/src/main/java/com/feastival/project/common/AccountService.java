//package com.feastival.project.common;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//
//
//public class AccountService implements UserDetailsService {
//    private final AccountRepository accountRepository;
//    private final PasswordEncoder passwordEncoder;
//
//
//    public Account createAccount(String username, String password) {
//        Account account = new Account();
//        account.setUsername(username);
//        account.setPassword(passwordEncoder.encode(password));
//        return accountRepository.save(account);
//    }
//
//
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        Account account = accountRepository.findByUsername(username)
//                .orElseThrow(() -> new UsernameNotFoundException(username));
//        return new User(account.getUsername(), account.getPassword(), authorities());
//
//
//    }
//}
