package Semiar5_hw.service;
import Semiar5_hw.model.User;

import java.util.List;

public interface DataService {
    User create(User user);
    List<User> read();
}
