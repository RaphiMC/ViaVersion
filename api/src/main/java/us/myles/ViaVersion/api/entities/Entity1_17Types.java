/*
 * This file is part of ViaVersion - https://github.com/ViaVersion/ViaVersion
 * Copyright (C) 2016-2021 ViaVersion and contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package us.myles.ViaVersion.api.entities;

import us.myles.ViaVersion.util.EntityTypeUtil;

public enum Entity1_17Types implements EntityType {

    ENTITY(-1),

    AREA_EFFECT_CLOUD(0, ENTITY),
    END_CRYSTAL(19, ENTITY),
    EVOKER_FANGS(24, ENTITY),
    EXPERIENCE_ORB(25, ENTITY),
    EYE_OF_ENDER(26, ENTITY),
    FALLING_BLOCK(27, ENTITY),
    FIREWORK_ROCKET(28, ENTITY),
    ITEM(40, ENTITY),
    LLAMA_SPIT(46, ENTITY),
    TNT(67, ENTITY),
    SHULKER_BULLET(74, ENTITY),
    FISHING_BOBBER(110, ENTITY),

    LIVINGENTITY(-1, ENTITY),
    ARMOR_STAND(1, LIVINGENTITY),
    PLAYER(109, LIVINGENTITY),

    ABSTRACT_INSENTIENT(-1, LIVINGENTITY),
    ENDER_DRAGON(20, ABSTRACT_INSENTIENT),

    BEE(5, ABSTRACT_INSENTIENT),

    ABSTRACT_CREATURE(-1, ABSTRACT_INSENTIENT),

    ABSTRACT_AGEABLE(-1, ABSTRACT_CREATURE),
    VILLAGER(96, ABSTRACT_AGEABLE),
    WANDERING_TRADER(98, ABSTRACT_AGEABLE),

    // Animals
    ABSTRACT_ANIMAL(-1, ABSTRACT_AGEABLE),
    AXOLOTL(3, ABSTRACT_ANIMAL),
    DOLPHIN(14, ABSTRACT_INSENTIENT),
    CHICKEN(10, ABSTRACT_ANIMAL),
    COW(12, ABSTRACT_ANIMAL),
    MOOSHROOM(56, COW),
    PANDA(59, ABSTRACT_INSENTIENT),
    PIG(62, ABSTRACT_ANIMAL),
    POLAR_BEAR(66, ABSTRACT_ANIMAL),
    RABBIT(69, ABSTRACT_ANIMAL),
    SHEEP(72, ABSTRACT_ANIMAL),
    TURTLE(94, ABSTRACT_ANIMAL),
    FOX(29, ABSTRACT_ANIMAL),

    ABSTRACT_TAMEABLE_ANIMAL(-1, ABSTRACT_ANIMAL),
    CAT(8, ABSTRACT_TAMEABLE_ANIMAL),
    OCELOT(57, ABSTRACT_TAMEABLE_ANIMAL),
    WOLF(103, ABSTRACT_TAMEABLE_ANIMAL),

    ABSTRACT_PARROT(-1, ABSTRACT_TAMEABLE_ANIMAL),
    PARROT(60, ABSTRACT_PARROT),

    // Horses
    ABSTRACT_HORSE(-1, ABSTRACT_ANIMAL),
    CHESTED_HORSE(-1, ABSTRACT_HORSE),
    DONKEY(15, CHESTED_HORSE),
    MULE(55, CHESTED_HORSE),
    LLAMA(45, CHESTED_HORSE),
    TRADER_LLAMA(92, CHESTED_HORSE),
    HORSE(36, ABSTRACT_HORSE),
    SKELETON_HORSE(77, ABSTRACT_HORSE),
    ZOMBIE_HORSE(106, ABSTRACT_HORSE),

    // Golem
    ABSTRACT_GOLEM(-1, ABSTRACT_CREATURE),
    SNOW_GOLEM(80, ABSTRACT_GOLEM),
    IRON_GOLEM(39, ABSTRACT_GOLEM),
    SHULKER(73, ABSTRACT_GOLEM),

    // Fish
    ABSTRACT_FISHES(-1, ABSTRACT_CREATURE),
    COD(11, ABSTRACT_FISHES),
    PUFFERFISH(68, ABSTRACT_FISHES),
    SALMON(71, ABSTRACT_FISHES),
    TROPICAL_FISH(93, ABSTRACT_FISHES),

    // Monsters
    ABSTRACT_MONSTER(-1, ABSTRACT_CREATURE),
    BLAZE(6, ABSTRACT_MONSTER),
    CREEPER(13, ABSTRACT_MONSTER),
    ENDERMITE(22, ABSTRACT_MONSTER),
    ENDERMAN(21, ABSTRACT_MONSTER),
    GIANT(31, ABSTRACT_MONSTER),
    SILVERFISH(75, ABSTRACT_MONSTER),
    VEX(95, ABSTRACT_MONSTER),
    WITCH(99, ABSTRACT_MONSTER),
    WITHER(100, ABSTRACT_MONSTER),
    RAVAGER(70, ABSTRACT_MONSTER),

    ABSTRACT_PIGLIN(-1, ABSTRACT_MONSTER),

    PIGLIN(63, ABSTRACT_PIGLIN),
    PIGLIN_BRUTE(64, ABSTRACT_PIGLIN),

    HOGLIN(35, ABSTRACT_ANIMAL),
    STRIDER(86, ABSTRACT_ANIMAL),
    ZOGLIN(104, ABSTRACT_MONSTER),

    // Illagers
    ABSTRACT_ILLAGER_BASE(-1, ABSTRACT_MONSTER),
    ABSTRACT_EVO_ILLU_ILLAGER(-1, ABSTRACT_ILLAGER_BASE),
    EVOKER(23, ABSTRACT_EVO_ILLU_ILLAGER),
    ILLUSIONER(38, ABSTRACT_EVO_ILLU_ILLAGER),
    VINDICATOR(97, ABSTRACT_ILLAGER_BASE),
    PILLAGER(65, ABSTRACT_ILLAGER_BASE),

    // Skeletons
    ABSTRACT_SKELETON(-1, ABSTRACT_MONSTER),
    SKELETON(76, ABSTRACT_SKELETON),
    STRAY(85, ABSTRACT_SKELETON),
    WITHER_SKELETON(101, ABSTRACT_SKELETON),

    // Guardians
    GUARDIAN(34, ABSTRACT_MONSTER),
    ELDER_GUARDIAN(18, GUARDIAN),

    // Spiders
    SPIDER(83, ABSTRACT_MONSTER),
    CAVE_SPIDER(9, SPIDER),

    // Zombies
    ZOMBIE(105, ABSTRACT_MONSTER),
    DROWNED(17, ZOMBIE),
    HUSK(37, ZOMBIE),
    ZOMBIFIED_PIGLIN(108, ZOMBIE),
    ZOMBIE_VILLAGER(107, ZOMBIE),

    // Flying entities
    ABSTRACT_FLYING(-1, ABSTRACT_INSENTIENT),
    GHAST(30, ABSTRACT_FLYING),
    PHANTOM(61, ABSTRACT_FLYING),

    ABSTRACT_AMBIENT(-1, ABSTRACT_INSENTIENT),
    BAT(4, ABSTRACT_AMBIENT),

    ABSTRACT_WATERMOB(-1, ABSTRACT_INSENTIENT),
    SQUID(84, ABSTRACT_WATERMOB),
    GLOW_SQUID(33, SQUID),

    // Slimes
    SLIME(78, ABSTRACT_INSENTIENT),
    MAGMA_CUBE(47, SLIME),

    // Hangable objects
    ABSTRACT_HANGING(-1, ENTITY),
    LEASH_KNOT(43, ABSTRACT_HANGING),
    ITEM_FRAME(41, ABSTRACT_HANGING),
    GLOW_ITEM_FRAME(32, ITEM_FRAME),
    PAINTING(58, ABSTRACT_HANGING),

    ABSTRACT_LIGHTNING(-1, ENTITY),
    LIGHTNING_BOLT(44, ABSTRACT_LIGHTNING),

    // Arrows
    ABSTRACT_ARROW(-1, ENTITY),
    ARROW(2, ABSTRACT_ARROW),
    SPECTRAL_ARROW(82, ABSTRACT_ARROW),
    TRIDENT(91, ABSTRACT_ARROW),

    // Fireballs
    ABSTRACT_FIREBALL(-1, ENTITY),
    DRAGON_FIREBALL(16, ABSTRACT_FIREBALL),
    FIREBALL(42, ABSTRACT_FIREBALL),
    SMALL_FIREBALL(79, ABSTRACT_FIREBALL),
    WITHER_SKULL(102, ABSTRACT_FIREBALL),

    // Projectiles
    PROJECTILE_ABSTRACT(-1, ENTITY),
    SNOWBALL(81, PROJECTILE_ABSTRACT),
    ENDER_PEARL(88, PROJECTILE_ABSTRACT),
    EGG(87, PROJECTILE_ABSTRACT),
    POTION(90, PROJECTILE_ABSTRACT),
    EXPERIENCE_BOTTLE(89, PROJECTILE_ABSTRACT),

    // Vehicles
    MINECART_ABSTRACT(-1, ENTITY),
    CHESTED_MINECART_ABSTRACT(-1, MINECART_ABSTRACT),
    CHEST_MINECART(49, CHESTED_MINECART_ABSTRACT),
    HOPPER_MINECART(52, CHESTED_MINECART_ABSTRACT),
    MINECART(48, MINECART_ABSTRACT),
    FURNACE_MINECART(51, MINECART_ABSTRACT),
    COMMAND_BLOCK_MINECART(50, MINECART_ABSTRACT),
    TNT_MINECART(54, MINECART_ABSTRACT),
    SPAWNER_MINECART(53, MINECART_ABSTRACT),
    BOAT(7, ENTITY);

    private static final EntityType[] TYPES;

    private final int id;
    private final EntityType parent;

    Entity1_17Types(int id) {
        this.id = id;
        this.parent = null;
    }

    Entity1_17Types(int id, EntityType parent) {
        this.id = id;
        this.parent = parent;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public EntityType getParent() {
        return parent;
    }

    static {
        TYPES = EntityTypeUtil.toOrderedArray(values());
    }

    public static EntityType getTypeFromId(int typeId) {
        return EntityTypeUtil.getTypeFromId(TYPES, typeId, ENTITY);
    }
}