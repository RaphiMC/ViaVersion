package us.myles.ViaVersion.api.entities;

import com.google.common.base.Optional;
import lombok.AllArgsConstructor;
import lombok.Getter;
import us.myles.ViaVersion.api.Via;


public class Entity1_14Types {
    public static EntityType getTypeFromId(int typeID) {
        Optional<EntityType> type = EntityType.findById(typeID);

        if (!type.isPresent()) {
            Via.getPlatform().getLogger().severe("Could not find type id " + typeID);
            return EntityType.ENTITY; // Fall back to the basic ENTITY
        }

        return type.get();
    }

    @AllArgsConstructor
    @Getter
    public enum EntityType {
        // Auto generated

        ENTITY(-1),

        AREA_EFFECT_CLOUD(0, ENTITY),
        ENDER_CRYSTAL(17, ENTITY),
        EVOCATION_FANGS(21, ENTITY),
        XP_ORB(23, ENTITY),
        EYE_OF_ENDER_SIGNAL(24, ENTITY),
        FALLING_BLOCK(25, ENTITY),
        FIREWORKS_ROCKET(26, ENTITY),
        ITEM(33, ENTITY),
        LLAMA_SPIT(38, ENTITY),
        TNT(57, ENTITY),
        SHULKER_BULLET(62, ENTITY),
        FISHING_BOBBER(100, ENTITY),

        LIVINGENTITY(-1, ENTITY),
        ARMOR_STAND(1, LIVINGENTITY),
        PLAYER(99, LIVINGENTITY),

        ABSTRACT_INSENTIENT(-1, LIVINGENTITY),
        ENDER_DRAGON(18, ABSTRACT_INSENTIENT),

        ABSTRACT_CREATURE(-1, ABSTRACT_INSENTIENT),

        ABSTRACT_AGEABLE(-1, ABSTRACT_CREATURE),
        VILLAGER(83, ABSTRACT_AGEABLE),
        WANDERING_TRADER(87, ABSTRACT_AGEABLE),

        // Animals
        ABSTRACT_ANIMAL(-1, ABSTRACT_AGEABLE),
        DOLPHIN(13, ABSTRACT_INSENTIENT),
        CHICKEN(8, ABSTRACT_ANIMAL),
        COW(10, ABSTRACT_ANIMAL),
        MOOSHROOM(48, COW),
        PIG(53, ABSTRACT_ANIMAL),
        POLAR_BEAR(56, ABSTRACT_ANIMAL),
        RABBIT(58, ABSTRACT_ANIMAL),
        SHEEP(60, ABSTRACT_ANIMAL),
        TURTLE(76, ABSTRACT_ANIMAL),

        ABSTRACT_TAMEABLE_ANIMAL(-1, ABSTRACT_ANIMAL),
        CAT(6, ABSTRACT_TAMEABLE_ANIMAL),
        OCELOT(49, ABSTRACT_TAMEABLE_ANIMAL),
        WOLF(92, ABSTRACT_TAMEABLE_ANIMAL),

        ABSTRACT_PARROT(-1, ABSTRACT_TAMEABLE_ANIMAL),
        PARROT(52, ABSTRACT_PARROT),

        // Horses
        ABSTRACT_HORSE(-1, ABSTRACT_ANIMAL),
        CHESTED_HORSE(-1, ABSTRACT_HORSE),
        DONKEY(12, CHESTED_HORSE),
        MULE(47, CHESTED_HORSE),
        LLAMA(37, CHESTED_HORSE),
        TRADER_LLAMA(74, CHESTED_HORSE),
        HORSE(30, ABSTRACT_HORSE),
        SKELETON_HORSE(65, ABSTRACT_HORSE),
        ZOMBIE_HORSE(94, ABSTRACT_HORSE),

        // Golem
        ABSTRACT_GOLEM(-1, ABSTRACT_CREATURE),
        SNOWMAN(68, ABSTRACT_GOLEM),
        VILLAGER_GOLEM(84, ABSTRACT_GOLEM),
        SHULKER(61, ABSTRACT_GOLEM),

        // Fish
        ABSTRACT_FISHES(-1, ABSTRACT_CREATURE),
        COD(9, ABSTRACT_FISHES),
        PUFFER_FISH(54, ABSTRACT_FISHES),
        SALMON_MOB(59, ABSTRACT_FISHES),
        TROPICAL_FISH(75, ABSTRACT_FISHES),

        // Monsters
        ABSTRACT_MONSTER(-1, ABSTRACT_CREATURE),
        BLAZE(4, ABSTRACT_MONSTER),
        CREEPER(11, ABSTRACT_MONSTER),
        ENDERMITE(20, ABSTRACT_MONSTER),
        ENDERMAN(19, ABSTRACT_MONSTER),
        GIANT(28, ABSTRACT_MONSTER),
        SILVERFISH(63, ABSTRACT_MONSTER),
        VEX(82, ABSTRACT_MONSTER),
        WITCH(88, ABSTRACT_MONSTER),
        WITHER(89, ABSTRACT_MONSTER),
        RAVAGER(97, ABSTRACT_MONSTER),

        // Illagers
        ABSTRACT_ILLAGER_BASE(-1, ABSTRACT_MONSTER),
        ABSTRACT_EVO_ILLU_ILLAGER(-1, ABSTRACT_ILLAGER_BASE),
        EVOCATION_ILLAGER(22, ABSTRACT_EVO_ILLU_ILLAGER),
        ILLUSION_ILLAGER(32, ABSTRACT_EVO_ILLU_ILLAGER),
        VINDICATION_ILLAGER(85, ABSTRACT_ILLAGER_BASE),
        PILLAGER(86, ABSTRACT_ILLAGER_BASE),

        // Skeletons
        ABSTRACT_SKELETON(-1, ABSTRACT_MONSTER),
        SKELETON(64, ABSTRACT_SKELETON),
        STRAY(73, ABSTRACT_SKELETON),
        WITHER_SKELETON(90, ABSTRACT_SKELETON),

        // Guardians
        GUARDIAN(29, ABSTRACT_MONSTER),
        ELDER_GUARDIAN(16, GUARDIAN),

        // Spiders
        SPIDER(71, ABSTRACT_MONSTER),
        CAVE_SPIDER(7, SPIDER),

        // Zombies - META CHECKED
        ZOMBIE(93, ABSTRACT_MONSTER),
        DROWNED(15, ZOMBIE),
        HUSK(31, ZOMBIE),
        ZOMBIE_PIGMAN(55, ZOMBIE),
        ZOMBIE_VILLAGER(95, ZOMBIE),

        // Flying entities
        ABSTRACT_FLYING(-1, ABSTRACT_INSENTIENT),
        GHAST(27, ABSTRACT_FLYING),
        PHANTOM(96, ABSTRACT_FLYING),

        ABSTRACT_AMBIENT(-1, ABSTRACT_INSENTIENT),
        BAT(3, ABSTRACT_AMBIENT),

        ABSTRACT_WATERMOB(-1, ABSTRACT_INSENTIENT),
        SQUID(72, ABSTRACT_WATERMOB),

        // Slimes
        SLIME(66, ABSTRACT_INSENTIENT),
        MAGMA_CUBE(39, SLIME),

        // Hangable objects
        ABSTRACT_HANGING(-1, ENTITY),
        LEASH_KNOT(36, ABSTRACT_HANGING),
        ITEM_FRAME(34, ABSTRACT_HANGING),
        PAINTING(50, ABSTRACT_HANGING),

        ABSTRACT_LIGHTNING(-1, ENTITY),
        LIGHTNING_BOLT(98, ABSTRACT_LIGHTNING),

        // Arrows
        ABSTRACT_ARROW(-1, ENTITY),
        ARROW(2, ABSTRACT_ARROW),
        SPECTRAL_ARROW(70, ABSTRACT_ARROW),
        TRIDENT(81, ABSTRACT_ARROW),

        // Fireballs
        ABSTRACT_FIREBALL(-1, ENTITY),
        DRAGON_FIREBALL(14, ABSTRACT_FIREBALL),
        FIREBALL(35, ABSTRACT_FIREBALL),
        SMALL_FIREBALL(67, ABSTRACT_FIREBALL),
        WITHER_SKULL(91, ABSTRACT_FIREBALL),

        // Projectiles
        PROJECTILE_ABSTRACT(-1, ENTITY),
        SNOWBALL(69, PROJECTILE_ABSTRACT),
        ENDER_PEARL(78, PROJECTILE_ABSTRACT),
        EGG(77, PROJECTILE_ABSTRACT),
        POTION(80, PROJECTILE_ABSTRACT),
        XP_BOTTLE(79, PROJECTILE_ABSTRACT),

        // Vehicles
        MINECART_ABSTRACT(-1, ENTITY),
        CHESTED_MINECART_ABSTRACT(-1, MINECART_ABSTRACT),
        CHEST_MINECART(41, CHESTED_MINECART_ABSTRACT),
        HOPPER_MINECART(44, CHESTED_MINECART_ABSTRACT),
        MINECART(40, MINECART_ABSTRACT),
        FURNACE_MINECART(43, MINECART_ABSTRACT),
        COMMANDBLOCK_MINECART(42, MINECART_ABSTRACT),
        TNT_MINECART(46, MINECART_ABSTRACT),
        SPAWNER_MINECART(45, MINECART_ABSTRACT),
        BOAT(5, ENTITY),
        ;

        private final int id;
        private final EntityType parent;

        EntityType(int id) {
            this.id = id;
            this.parent = null;
        }

        public static Optional<EntityType> findById(int id) {
            if (id == -1)  // Check if this is called
                return Optional.absent();

            for (EntityType ent : EntityType.values())
                if (ent.getId() == id)
                    return Optional.of(ent);

            return Optional.absent();
        }

        public boolean is(EntityType... types) {
            for (EntityType type : types)
                if (is(type))
                    return true;
            return false;
        }

        public boolean is(EntityType type) {
            return this == type;
        }

        public boolean isOrHasParent(EntityType type) {
            EntityType parent = this;

            do {
                if (parent == type)
                    return true;

                parent = parent.getParent();
            } while (parent != null);

            return false;
        }
    }
}