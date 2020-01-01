package com.chris.pmagtaservices.controller;

import com.chris.pmagtaservices.model.*;
import com.chris.pmagtaservices.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class MainController {

    private AddonAccountDataRepository addonAccountDataRepository;
    private AddonInventoryItemsRepository addonInventoryItemsRepository;
    private BillingRepository billingRepository;
    private DatastoreDataRepository datastoreDataRepository;
    private GangInventoryRepository gangInventoryRepository;
    private GangMembersRepository gangMembersRepository;
    private GangRepository gangRepository;
    private OwnedPropertiesRepository ownedPropertiesRepository;
    private OwnedVehiclesRepository ownedVehiclesRepository;
    private TrunkInventoryRepository trunkInventoryRepository;
    private UserInventoryRepository userInventoryRepository;
    private UsersRepository usersRepository;

    @Autowired
    public MainController(AddonAccountDataRepository addonAccountDataRepository, AddonInventoryItemsRepository addonInventoryItemsRepository,
                          BillingRepository billingRepository,DatastoreDataRepository datastoreDataRepository, GangInventoryRepository gangInventoryRepository,
                          GangMembersRepository gangMembersRepository, GangRepository gangRepository, OwnedPropertiesRepository
                          ownedPropertiesRepository, OwnedVehiclesRepository ownedVehiclesRepository, TrunkInventoryRepository
                          trunkInventoryRepository, UserInventoryRepository userInventoryRepository, UsersRepository usersRepository){
        this.addonAccountDataRepository = addonAccountDataRepository;
        this.addonInventoryItemsRepository = addonInventoryItemsRepository;
        this.billingRepository = billingRepository;
        this.datastoreDataRepository = datastoreDataRepository;
        this.gangInventoryRepository = gangInventoryRepository;
        this.gangMembersRepository = gangMembersRepository;
        this.gangRepository = gangRepository;
        this.ownedPropertiesRepository = ownedPropertiesRepository;
        this.ownedVehiclesRepository = ownedVehiclesRepository;
        this.trunkInventoryRepository = trunkInventoryRepository;
        this.userInventoryRepository = userInventoryRepository;
        this.usersRepository = usersRepository;
    }

    @GetMapping("get-users")
    public List<Users> getUsers(){
        return usersRepository.findAll();
    }

    @GetMapping("get-users-inventory")
    public List<UserInventory> getUsersInventory(){
        return userInventoryRepository.findAll();
    }

    @GetMapping("get-trunk-inventory")
    public List<TrunkInventory> getTrunkInventory(){
        return trunkInventoryRepository.findAll();
    }

    @GetMapping("get-owned-vehicles")
    public List<OwnedVehicles> getOwnedVehicles(){
        return ownedVehiclesRepository.findAll();
    }

    @GetMapping("get-owned-properties")
    public List<OwnedProperties> getOwnedProperties(){
        return ownedPropertiesRepository.findAll();
    }

    @GetMapping("get-gang-members")
    public List<GangMembers> getGangMembers(){
        return gangMembersRepository.findAll();
    }

    @GetMapping("get-gang-inventory")
    public List<GangInventory> getGangInventory(){
        return gangInventoryRepository.findAll();
    }

    @GetMapping("get-gang")
    public List<Gang> getGang(){
        return gangRepository.findAll();
    }

    @GetMapping("get-datastore-data")
    public List<DatastoreData> getDatastoreData(){
        return datastoreDataRepository.findAll();
    }

    @GetMapping("get-billing")
    public List<Billing> getBilling(){
        return billingRepository.findAll();
    }

    @GetMapping("get-addon-inventory-items")
    public List<AddonInventoryItems> getAddonInventoryItems(){
        return addonInventoryItemsRepository.findAll();
    }

    @GetMapping("get-addon-account-items-data")
    public List<AddonAccountData> getAddonAccountData(){
        return addonAccountDataRepository.findAll();
    }

    @GetMapping("get-users-count")
    public int getUsersCount(){
        List<Users> usersCount = usersRepository.findAll();
        return usersCount.size();
    }
}
