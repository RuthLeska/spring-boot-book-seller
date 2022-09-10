package com.fu.springbootbookseller.service;


import com.fu.springbootbookseller.model.PurchaseHistory;
import com.fu.springbootbookseller.repository.IPurchaseHistoryRepository;
import com.fu.springbootbookseller.repository.projection.IPurchaseItem;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;



@Service
public class PurchaseHistoryService implements IPurchaseHistoryService {

    private IPurchaseHistoryRepository purchaseHistoryRepository;

    public PurchaseHistoryService(IPurchaseHistoryRepository purchaseHistoryRepository) {

        this.purchaseHistoryRepository = purchaseHistoryRepository;
    }

    @Override
    public PurchaseHistory savePurchaseHistory(PurchaseHistory purchaseHistory) {

        purchaseHistory.setPurchaseTime(LocalDateTime.now());

        return purchaseHistoryRepository.save(purchaseHistory);
    }

    @Override
    public List<IPurchaseItem> findPurchasedItemsOfUser(Long userId) {

        return purchaseHistoryRepository.findAllPurchasesOfUser(userId);
    }

}
