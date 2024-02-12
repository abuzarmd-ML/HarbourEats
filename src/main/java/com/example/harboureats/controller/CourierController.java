package com.example.harboureats.controller;

import com.example.harboureats.model.CourierJoinRequest;
import com.example.harboureats.model.QuestDetailsResponse;
import com.example.harboureats.service.CourierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/couriers/{courierId}/quests")
public class CourierController {

    @Autowired
    private CourierService courierService;

    @PostMapping("/join")
    public ResponseEntity<String> joinQuest(
            @PathVariable String courierId,
            @RequestBody CourierJoinRequest joinRequest
    ) {
        courierService.joinQuest(courierId, joinRequest);
        return ResponseEntity.ok("Courier joined the quest");
    }

    @GetMapping("/active")
    public ResponseEntity<List<QuestDetailsResponse>> getActiveQuests(@PathVariable String courierId) {
        List<QuestDetailsResponse> activeQuests = courierService.getActiveQuests(courierId);
        return ResponseEntity.ok(activeQuests);
    }

    // Implement other courier-facing endpoints similarly
}
